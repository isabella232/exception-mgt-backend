package com.introspec.ticketing.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.introspec.ticketing.entity.Channel;


@Repository
public interface ChannelRepo extends  JpaRepository<Channel, Long> {
	public List<Channel> findByTicketId(Long ticketid);
//	public List<Channel> findByType(String type);

	}

