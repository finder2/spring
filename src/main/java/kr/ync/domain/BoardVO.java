package kr.ync.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {

	private Long bno;
	private String title;
	private String content;
	private String id;
	private Date regdate;
	private int hits;
	private int comment_count;
	
	private String board_img;
  
	private String file_1;
	private String file_2;
	private String file_3;
}
