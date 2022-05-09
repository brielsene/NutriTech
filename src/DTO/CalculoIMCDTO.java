/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Sene
 */
public class CalculoIMCDTO {
    float resultado;
    private float altura, peso;
    
        public float getAltura(){
            return peso;
        }
        
        public void setAltura(float altura){
            this.altura = altura;
        }
        
        public float getPeso(){
            return peso;
        }
        
        public void setPeso(float peso){
            this.peso = peso;
        }
        public float calculoIMC(float peso, float alturam){
            return resultado = peso/(altura*2);
            
            
        }
    
}
