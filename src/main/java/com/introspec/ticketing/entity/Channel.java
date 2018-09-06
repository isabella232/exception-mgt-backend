package com.introspec.ticketing.entity;

import java.util.Date;

import javax.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import lombok.Data;


@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Channel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
//	private Integer Time;
	private String type;
	private String name;
	
	@ManyToOne
	private Ticket ticket;
	
	public Channel() {}
	
	public Channel(String id, String type, String name, Long ticketid) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.ticket= new Ticket(ticketid, 1l, "", "", "", new Date(), 0.00, "", new Date(), new Date());
	}


	
}


