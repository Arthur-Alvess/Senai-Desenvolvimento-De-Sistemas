document.addEventListener('DOMContentLoaded', () => {
  carregarBibliotecarios();

  const form = document.getElementById('formCadastro');
  form.addEventListener('submit', cadastrar);
});

function carregarBibliotecarios() {
  fetch('http://localhost:8080/bibliotecario', {
    method: 'GET',
    headers: {
      'Content-Type': 'application/json'
    },
  })
  .then(response => response.json())
  .then(data => {
    addlinha(data);
  })
  .catch(error => {
    console.log(error);
  });
}

function addlinha(dadosAPI) {
  const tabela = document.getElementById('tabelaCorpo');
  tabela.innerHTML = '';
  dadosAPI.forEach(element => {
    const linha = document.createElement('tr');
    linha.innerHTML = `
      <td class="px-4 py-2">${element.id || ''}</td>
      <td class="px-4 py-2">${element.nome}</td>
      <td class="px-4 py-2">${element.email}</td>
      <td class="px-4 py-2">
        <button class="bg-red-500 text-white px-2 py-1 rounded">Remover</button>
      </td>
    `;
    linha.querySelector('button').addEventListener('click', () => {
      deletarbibliotecario(element.id);
    });
    tabela.appendChild(linha);
  });
}

function cadastrar(event) {
  event.preventDefault();
  const nome = document.getElementById('nome').value.trim();
  const email = document.getElementById('email').value.trim();

  if (nome && email) {
    fetch('http://localhost:8080/bibliotecario', { 
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({ nome, email })
    })
    .then(response => response.json())
    .then(data => {
      Swal.fire({
        icon: 'success',
        title: 'Sucesso!',
        text: 'Cadastro feito com sucesso'
      });
      document.getElementById('formCadastro').reset();
      carregarBibliotecarios();
    })
    .catch(error => {
      console.error("Erro ao enviar dados:", error);
    });
  } else {
    Swal.fire({
      icon: 'error',
      title: 'Erro!',
      text: 'Faltam dados para cadastrar'
    });
  }
}

function deletarbibliotecario(id) {
  if (confirm("Deseja realmente excluir este bibliotecário?")) {
    fetch(`http://localhost:8080/bibliotecario/${id}`, {
      method: 'DELETE'
    })
    .then(response => {
      if (!response.ok) {
        throw new Error('Erro ao excluir bibliotecário.');
      }
      Swal.fire({
        icon: 'success',
        title: 'Excluído!',
        text: 'Bibliotecário excluído com sucesso.'
      });
      carregarBibliotecarios();
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
