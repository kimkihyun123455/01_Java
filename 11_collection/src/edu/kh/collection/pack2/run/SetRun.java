package edu.kh.collection.pack2.run;

import edu.kh.collection.pack2.model.service.SetService;

public class SetRun {

	public static void main(String[] args) {

		SetService ser = new SetService();
		
		ser.lottoNumberGenerator();
	}

}
