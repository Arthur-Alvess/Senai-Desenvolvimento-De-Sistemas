#include <LiquidCrystal.h>

LiquidCrystal lcd(12, 11, 5, 4, 3, 2);

const int buzzer = 9;
const int pinoLDR1 = A0;
const int pinoLDR2 = A1;

int valorLDR1 = 0;
int valorLDR2 = 0;

const int notas[] = {261, 294, 329, 349, 392, 440, 493, 523}; 

void setup() {
  
  lcd.begin(16,2);  
  
  pinMode(pinoLDR1, INPUT); 
  pinMode(pinoLDR2, INPUT);
  pinMode(buzzer, OUTPUT);   
  
  lcd.noCursor();  
}

void loop() {

  
  valorLDR1 = analogRead(pinoLDR1);
  valorLDR2 = analogRead(pinoLDR2);

  
  int nota1 = map(valorLDR1, 0, 1023, 0, 7); 
  int nota2 = map(valorLDR2, 0, 1023, 0, 7);

  
  tone(buzzer, notas[nota1]);
  delay(500); 

  
  tone(buzzer, notas[nota2]);
  delay(500);
  
 
  lcd.setCursor(0, 0);         
  lcd.print("Freq LDR1: ");    
  lcd.setCursor(13, 0);        
  lcd.print(notas[nota1]);    
  
 
  lcd.setCursor(0, 1);         
  lcd.print("Freq LDR2: ");    
  lcd.setCursor(13, 1);       
  lcd.print(notas[nota2]);    
  
  noTone(buzzer);  
}