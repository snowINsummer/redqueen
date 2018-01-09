package redqueen.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redqueen.body.fdd.FddMessage;
import redqueen.mapper.fdd.FddMapper;
import redqueen.service.FddService;

@Service
public class FddServiceImpl implements FddService {

    @Autowired
    private FddMapper fddMapper;

    @Override
    public Object getSignatoryMessage(FddMessage fddMessage) {
        String sendReason = "SMS" + fddMessage.getMobile();
        return fddMapper.getSignatoryMessage(sendReason);
    }


}
