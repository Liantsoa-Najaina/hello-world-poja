package com.hello.world.service.event;

import com.hello.world.endpoint.event.model.SendEmailRequested;
import com.hello.world.mail.Email;
import com.hello.world.mail.Mailer;
import jakarta.mail.internet.InternetAddress;
import java.util.List;
import java.util.function.Consumer;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SendEmailRequestedService implements Consumer<SendEmailRequested> {
	private final Mailer mailer;

	@SneakyThrows
	@Override
	public void accept(SendEmailRequested sendEmailRequested) {
		InternetAddress recipientAddress = new InternetAddress(sendEmailRequested.getTo());
		mailer.accept(new Email(recipientAddress, List.of(), List.of(), "", "... world!", List.of()));
	}
}
