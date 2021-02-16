package com.bar.rg.service;

import org.springframework.mail.SimpleMailMessage;

import com.bar.rg.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido pedido);
	
	void sendEmail(SimpleMailMessage msg);
}
