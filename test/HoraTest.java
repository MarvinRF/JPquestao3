package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import entities.Hora;

public class HoraTest {
	
	@Test
	@DisplayName("verifica se a hora foi criada corretamente")
	public void constructorTest_CreateHora_HoraCreated() {
		Hora hora = new Hora("0:0:0");
	}
	@Test
	@DisplayName("caso as horas sejam identicas devera ser retornado 0")
	public void comparaTest_equalTime_returnZero(){
		Hora hora1 = new Hora("00:00:00");
		Hora hora2 = new  Hora("00:00:00");
		assertEquals(0,hora1.compara(hora2));
	}
	@Test
	@DisplayName("caso a hora seja inválida, deve ser definida como 00:00:00")
	public void constructorTest_dataIsInvalid_DataDefinedHow_01_01_0001() {
		Hora hora = new Hora("abc");
		assertEquals("0:0:0",hora.getTime());
	}
	
}