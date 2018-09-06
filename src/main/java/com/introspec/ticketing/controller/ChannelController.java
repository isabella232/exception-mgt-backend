package com.introspec.ticketing.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.introspec.ticketing.entity.Channel;
import com.introspec.ticketing.entity.Ticket;
import com.introspec.ticketing.service.ChannelService;

@RestController
@RequestMapping("/tickets/{ticketId}")
@CrossOrigin(origins = "http://localhost:3000")
public class ChannelController {
	
	private final ChannelService channelService;
	@Autowired
	public ChannelController(final ChannelService channelService) {
		this.channelService = channelService;
	}
	
	@GetMapping("")
	public List<Channel> getAllChannel(){
		return channelService.getAllChannel();
	}
	
	@GetMapping("/{id}")
	public Channel getChannel(@PathVariable Long id){	
		return channelService.getChannel(id).get();
	}
	
	@PostMapping("")
	public Channel addChannel(@RequestBody Channel channel, @PathVariable Long ticketid){
		channel.setTicket(new Ticket(ticketid));
		return channelService.addChannel(channel);
	}

	}
	


