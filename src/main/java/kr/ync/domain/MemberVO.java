package kr.ync.domain;


import lombok.Data;


public @Data class MemberVO {

	private String ID;
	private String PASSWORD;
	private String NAME;
	private String NICKNAME;
    private String EMAIL;
    private Integer USER_LEVEL;
    
    
}

