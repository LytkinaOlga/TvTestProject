package by.bntu.fitr.poisit.lytkina.service;

import by.bntu.fitr.poisit.lytkina.bean.TV;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TvService {
    private TV tv;
    Logger logger = LoggerFactory.getLogger(TvService.class);

    public TvService(TV tv) {
        this.tv = tv;
    }

    public boolean ifOne(){
        logger.info("checking if the TV is on");
        return tv.isOn();
    }
}
