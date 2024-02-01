package model;

public class MusicVo {
	// Music의 설계도 만들기
	// VO = 밸류 오브젝트.
	// 필드 만들기 -> 생성자를 이용해서 초기값을 가진 객체를 만들기.
	
	// 제목, 가수명, 음악길이(초), 음악파일의 경로,
	private String title;
	private String singer;
	private int playtime;
	private String musiPath;	
	
	// 생성자
	public MusicVo(String title, String singer, int playtime, String musiPath) {
		this.title = title;
		this.singer = singer;
		this.playtime = playtime;
		this.musiPath = musiPath;
	}
	
    // getter
	public String getTitle() {
		return title;
	}

	public String getSinger() {
		return singer;
	}

	public int getPlaytime() {
		return playtime;
	}

	public String getMusiPath() {
		return musiPath;
	}
	
	
	
	
	

}
