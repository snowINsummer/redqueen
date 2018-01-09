package redqueen.service;

import redqueen.body.fdd.FddMessage;

public interface FddService {
    Object getSignatoryMessage(FddMessage fddMessage);
}
