package com.anthony;

import java.io.IOException;

public class Start {

	public static void main(String[] args) {
		try {
			GameWindow.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}