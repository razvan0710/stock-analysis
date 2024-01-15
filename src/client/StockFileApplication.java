package client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

import fileprocessors.StockFileData;
import fileprocessors.StockFileReader;

public class StockFileApplication {
	
	public void main(String args[]) throws IOException{
		StockFileReader fr = new StockFileReader("table.csv");

		List<HashMap<String, Double>> dataResult = populateStockFileData(fr.getHeaders(), fr.readFileData());
		StockFileData fileData = new StockFileData();
		fileData.addData(dataResult);
		fileData.printData();
		System.out.println(dataResult.size());

		Printer printer = new Printer();
		printer.print(null);





	}

	static class Printer {
		public void print(Object obj){
			System.out.println("obj");
		}
		public void print(String obj){
			System.out.println("str");

		}
	}
	/**
	 * Complete the method body so that it returns the given structure needed to
	 * populate the data field in the StockFileData class.
	 * @param headers
	 * @param lines
	 * @return List
	 */
	public static List<HashMap<String, Double>> populateStockFileData(List<String> headers, List<String> lines){
		List<HashMap<String, Double>> dataResult = new ArrayList<>();
		// Insert your code here..
		return dataResult;
	}
	
	
}
