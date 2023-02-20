package com.tvs.api.gateway;


import com.tvs.api.gateway.exception.ResourceNotFoundException;
import com.tvs.api.gateway.model.Model;
import com.tvs.api.gateway.model.Resopnse;
import org.springframework.web.client.HttpClientErrorException;

import javax.validation.ConstraintViolationException;
import java.util.NoSuchElementException;

@org.springframework.stereotype.Service
public class Service {


    public Resopnse tvsAPIGateway(Model model){
        try {
            if(model.getRequestID().isEmpty()
                    ||model.getSenderChannel().isEmpty()
                    ||model.getSessionId().isEmpty()
                    ||model.getRequestTime().isEmpty()
                    ||model.getRequestBody().isEmpty()
                    ||model.getMacIn().isEmpty()
                    ||model.getApplicationInfo().getAppVersion().isEmpty()
                    ||model.getApplicationInfo().getApplicationLanguage().isEmpty()
                    ||model.getDeviceInfo().getDeviceID().isEmpty()
                    ||model.getDeviceInfo().getOperatingSystem().isEmpty()) {
                throw new ResourceNotFoundException(model.getRequestID());
            }else{
                return new Resopnse(
                        model.getRequestID(),
                        System.currentTimeMillis() + "",
                        "000",
                        "SUCCESSFULL",
                        "ewogICAgdXNlcm5hbWUgOiJhc2ppZCIsCiAgICBwYXNzd29yZCA6ICJ6YWluY2FzaCIKfQ"
                );
            }
        } catch (NoSuchElementException exception) {
            throw new ResourceNotFoundException(model.getRequestID());
        } catch (HttpClientErrorException.BadRequest exception) {
            throw new ResourceNotFoundException(model.getRequestID());
        }catch (ConstraintViolationException e) {
            throw new ResourceNotFoundException(model.getRequestID());
        }
    }

}
