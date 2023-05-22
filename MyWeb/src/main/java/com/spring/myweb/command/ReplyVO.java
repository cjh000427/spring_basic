package com.spring.myweb.command;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
CREATE TABLE freereply(
	rno INT PRIMARY KEY AUTO_INCREMENT,
    bno INT,
    
    foreign key (bno) 
    references freeboard(bno)
    on delete cascade,
    
    reply VARCHAR(1000),
    reply_id VARCHAR(50),
    relpy_pw VARCHAR(50),
    relpy_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    update_date DATETIME DEFAULT NULL
);
 */
@Getter
@Setter
@ToString
public class ReplyVO {
	
	private int rno;
	private int bno;
	
	private String relpy;
	private String relpyId;
	private String relpyPw;
	private LocalDateTime replyDate;
	private LocalDateTime updateDate;

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}





