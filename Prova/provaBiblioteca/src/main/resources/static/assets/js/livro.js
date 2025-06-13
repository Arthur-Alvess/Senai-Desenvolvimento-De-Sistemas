document.addEventListener('DOMContentLoaded', () => {
  carregarLivros();

  const form = document.getElementById('formCadastro');
  if (form) {
    form.addEventListener('submit', cadastrarLivro);
  }
});

function carregarLivros() {
  fetch('http://localhost:8080/livro', {
    method: 'GET',
    headers: {
      'Content-Type': 'application/json'
    },
  })
  .then(response => response.json())
  .then(data => {
    addLinhaLivro(data);
  })
  .catch(error => {
    console.log(error);
  });
}

function addLinhaLivro(dadosAPI) {
  const tabela = document.getElementById('tabelaCorpo');
  tabela.innerHTML = '';
  dadosAPI.forEach(element => {
    const linha = document.createElement('tr');
    linha.innerHTML = `
      <td class="px-4 py-2">${element.id || ''}</td>
      <td class="px-4 py-2">${element.bibliotecario ? element.bibliotecario.id : ''}</td>
      <td class="px-4 py-2">${element.titulo}</td>
      <td class="px-4 py-2">${element.autor}</td>
      <td class="px-4 py-2">${element.genero}</td>
      <td class="px-4 py-2">
        <button class="bg-red-500 text-white px-2 py-1 rounded">Remover</button>
      </td>
    `;
    linha.querySelector('button').addEventListener('click', () => {
      deletarLivro(element.id);
    });
    tabela.appendChild(linha);
  });
}

function cadastrarLivro(event) {
  event.preventDefault();
  const titulo = document.getElementById('titulo').value.trim();
  const autor = document.getElementById('autor').value.trim();
  const genero = document.getElementById('genero').value.trim();
  const status = document.getElementById('status').value;
  const dataCadastro = document.getElementById('dataCadastro').value;
  const bibliotecarioId = document.getElementById('bibliotecarioId').value;

  if (titulo && autor && genero && status && dataCadastro && bibliotecarioId) {
    fetch('http://localhost:8080/livro', { 
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({
        titulo,
        autor,
        genero,
        status,
        dataCadastro,
        bibliotecario: { id: Number(bibliotecarioId) }
      })
    })
    .then(response => response.json())
    .then(data => {
      Swal.fire({
        icon: 'success',
        title: 'Sucesso!',
        text: 'Livro cadastrado com sucesso'
      });
      document.getElementById('formCadastro').reset();
      carregarLivros();
    })
    .catch(error => {
      console.error("Erro ao enviar dados:", error);
      Swal.fire({
        icon: 'error',
        title: 'Erro!',
        text: 'Erro ao cadastrar livro.'
      });
    });
  } else {
    Swal.fire({
      icon: 'error',
      title: 'Erro!',
      text: 'Faltam dados para cadastrar'
    });
  }
}

function deletarLivro(id) {
  if (confirm("Deseja realmente excluir este livro?")) {
    fetch(`http://localhost:8080/livro?id=${id}`, {
      method: 'DELETE'
    })
    .then(response => {
      if (!response.ok) {
        throw new Error('Erro ao excluir livro.');
      }
      Swal.fire({
        icon: 'success',
        title: 'Excluído!',
        text: 'Livro excluído com sucesso.'
      });
      carregarLivros();
    })
    .catch(error => {
      console.error(error);
      Swal.fire({
        icon: 'error',
        title: 'Erro!',
        text: 'Erro ao excluir. Verifique o servidor ou se o ID existe.'
      });
    });
  }
}