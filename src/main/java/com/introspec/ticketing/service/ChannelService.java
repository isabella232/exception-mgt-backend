package com.introspec.ticketing.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.introspec.ticketing.entity.Channel;
import com.introspec.ticketing.exception.ResourceNotFound;
import com.introspec.ticketing.repo.ChannelRepo;

@Service
public class ChannelService {
	
	private final ChannelRepo channelRepo;
	
	@Autowired
	public ChannelService(final ChannelRepo channelRepo) { 
		this.channelRepo = channelRepo;
	}

	
	 public List<Channel> getAllChannel(Long ticketid) {
		 List<Channel> channel = new ArrayList<>();
		channelRepo.findByTicketId(ticketid)
		.forEach(channel::add);
		return channel;
			
			}
	 
	 public Optional<Channel> getChannel(Long id){
			return channelRepo.findById(id);
		}
	 
	 public Channel addChannel(Channel channel) {
			return channelRepo.save(channel);	
		}
}


	
	 
	
	
	

	
	

	

	

