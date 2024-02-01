package controller;

import java.util.ArrayList;
import javazoom.jl.player.MP3Player;
import model.MusicVo;

public class MainController {
	// Controller의 역활: 자료 조작과 계산을 수행하는 비즈니스 로직. (실제 서비스 로직.)
	// view로부터 데이터를 받아서 가공하거나 처리하는 역활.
	// model의 데이터를 수정하거나 가지고 오는 역활.
	
	// 곡을 5개 저장할수 있는 ArratList 생성
	ArrayList<MusicVo> musicList = new ArrayList<>(5);
	
	// 노래를 재생 / 정지 할수 있는 기능을 가진 객체.
	// Player.jar에 있는 MP3Player 클래스를 이용해 생성.
	MP3Player mp3 = new MP3Player();
	int index =0;
	
	public MainController() {
		// Controller 객체가 생성되자마자 음악을 미리 준비하도록 하기위해서.
		// 1. MusicVo객체 생성.
		// 2. 해당객체를 musicList라고 하는 어레이 리스트에 add함.
		musicList.add(new MusicVo("꽃", "지수", 100,"../Ex10MusicPlayer/src/musicList/JISOO  꽃.mp3")); 
		musicList.add(new MusicVo("spicy", "에스파", 100,"../music/에스파 spicy.mp3")); 
		
	}
	
	// 재생
	public void play() {
		//현재 재생중인 음악이 있는지 확인하기
		if(mp3.isPlaying()) {
			// 재생중인 음악 정지
			mp3.stop();			
		}
		
		// index가 가리키고 있는 위치에 있는 음악을 재생
		mp3.play(musicList.get(index).getMusiPath());
		
		
		
	}
	

}
