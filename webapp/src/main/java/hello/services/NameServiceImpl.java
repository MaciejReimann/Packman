package hello.services;

import org.springframework.stereotype.Service;

@Service
public class NameServiceImpl implements NameService{

	@Override
	public String getName() {
		
		return "Nasza aplikacja";
	}

}
