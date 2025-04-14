package controller;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import util.Teclado;

public class ExemploformatData {

	public static void main(String[] args) {
		Date data = new Date();
		System.out.println("Data: "+data);
		
		Date dataInserida = new Date(1724708237150L);
		System.out.println("Data inserida: "+dataInserida);
		
		Date dataInserida2 = new Date(111,8,14);
		System.out.println("Data inserida 2: "+dataInserida2);
		
		Calendar data2 = new GregorianCalendar();
		System.out.println("Data 2: "+data2);
		
		data2.set(2011, 8, 14);
		System.out.println("Data 2 inserida: "+data2);

		System.out.println("Mês: "+data2.get(Calendar.MONTH));
		
		System.out.println("Dia da semana: "+data2.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("Dia do mês: "+data2.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("Dia do ano: "+data2.get(Calendar.DAY_OF_YEAR));
		
		//Formatador de data:
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL);
		
		Calendar data3 = new GregorianCalendar(2010, 8, 25);
		//data3.set(2010, 8, 25);
		System.out.println("Data 3 (FULL): "+df1.format(data3.getTime()));
		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("Data 3 (LONG): "+df2.format(data3.getTime()));
		
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("Data 3 (MEDIUM): "+df3.format(data3.getTime()));
		
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("Data 3 (SHORT): "+df4.format(data3.getTime()));
		
		TimeZone tzBr = TimeZone.getTimeZone("GMT-3:00");
		TimeZone.setDefault(tzBr);
		System.out.println("Brasil: "+DateFormat.getTimeInstance().format(new Date()));
		TimeZone.setDefault(TimeZone.getTimeZone("GMT+9:00"));
		System.out.println("Japão: "+DateFormat.getTimeInstance().format(new Date()));
		TimeZone.setDefault(TimeZone.getTimeZone("GMT+0:00"));
		System.out.println("Islândia: "+DateFormat.getTimeInstance().format(new Date()));
		TimeZone.setDefault(TimeZone.getTimeZone("GMT+2:00"));
		System.out.println("Essuatíni: "+DateFormat.getTimeInstance().format(new Date()));
	
		String dataString = Teclado.lerTexto("Informe a data(dd/mm/aaaa):");
		int dia = Integer.parseInt(dataString.substring(0,2));
		int mes = Integer.parseInt(dataString.substring(3,5));
		int ano = Integer.parseInt(dataString.substring(6));
		System.out.println("Dia: "+dia);
		System.out.println("Mês: "+mes);
		System.out.println("Ano: "+ano);
		Calendar dataTeclado = new GregorianCalendar(ano,mes-1,dia+1);
		System.out.println("Data inserida: "+df1.format(dataTeclado.getTime()));
		
		
	}

}
