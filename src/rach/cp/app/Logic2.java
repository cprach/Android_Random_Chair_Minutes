/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rach.cp.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import android.util.Log;

public class Logic2 {

	private String mahenMultiplier = "Mahen";
	private boolean mm;
	private String[] standardNames = {"Matt","Steven","Mahen","Rachael"};
	private Map<Integer,String> playerMap = new HashMap<Integer,String>();
	private String chair;
	private String minuteTaker;

	public Logic2(String[] playerNames) {
		mm = false;
		addPlayers(playerNames);
		makeNames();
	}
	public Logic2() {
		addPlayers(standardNames);
		makeNames();
	}
	private void addPlayers(String[] playerNames) {
		if (playerNames != null) {
			for (int x = 0; x < playerNames.length; x ++) {
				playerMap.put(x,playerNames[x]);
			}
		}
	}
	public void makeNames() {
		String chairName = makeChair();
		String minuteTakerName = makeMinuteTaker();
		while (chairName.equals(minuteTakerName)) {
			minuteTakerName = makeMinuteTaker();
		}
		chair = chairName;
		minuteTaker = minuteTakerName;
	}
	private void addMultiplierName() {
		playerMap.put(playerMap.size(), mahenMultiplier);
	}
	
	private String makeChair() {
		String chName = mkeChair();
		while (chName.equals(mahenMultiplier)) {
			chName = mkeChair();
		}
		return chName;
	}
	
	private String mkeChair() {
		String ch = null;
		int i = generateRandomNum(0,playerMap.size());
		ch = playerMap.get(i);
		Log.d("chair name this time:::::: ", ch);
		return ch;
	}
	private String makeMinuteTaker() {
		if (mm == true) {
			addMultiplierName();
		}
		String mt = null;
		int i = generateRandomNum(0,playerMap.size());
		mt = playerMap.get(i);
		return mt;
	}
	private int generateRandomNum(int min, int max) {
		Random r = new Random();
		int rr = r.nextInt((max - min));
		System.out.println(min + "," + max + "," + rr);
		return rr;
	}
	public String getChair() {
		return chair;
	}
	public String getMinuteTaker() {
		return minuteTaker;
	}


}

