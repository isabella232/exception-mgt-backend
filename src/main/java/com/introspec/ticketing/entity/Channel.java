package com.introspec.ticketing.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import lombok.Data;


@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Channel {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
//	private Integer Time;
	private String type;
	private String name;
//	private Set<Ticket> ticket = new HashSet<Ticket>();
	
	@ManyToOne
//	(cascade=CascadeType.ALL,  targetEntity=Ticket.class)
//	@JoinColumn(name="id")
	private Ticket ticket;
	
	
////	public Ticket ticket = new Ticket();
//	 public Set<Ticket> getTicket() { return ticket; }
//	 void setTicket(Set ticket) { this.ticket = ticket; }
//	private Set<Ticket> ticket =  new TreeSet<>();
	
	public Channel() {}
	
	public Channel(Long id, String type, String name, Long ticketid) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
//		this.ticket= new Ticket(ticketid);
		this.ticket= new Ticket(ticketid, 1l, "", "", "",  new Date(), 0.00, new Date(), new Date());
	} 	
}


