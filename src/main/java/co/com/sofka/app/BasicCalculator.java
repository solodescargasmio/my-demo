package co.com.sofka.app;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);
    public Long sum(Long number1, Long number2){
        logger.info("Suming {} + {}",number1,number2);
        return number1 + number2;
    }
    public Long rest(Long number1, Long number2){
        logger.info("Subtracting {} + {}",number1,number2);
        return number1 - number2;
    }
    public Long multiplication(Long number1, Long number2){
        logger.info("Multiplicating {} + {}",number1,number2);
        return number1 * number2;
    }
    public Long division(Long number1, Long number2){
        logger.info("Dividing {} + {}",number1,number2);
        return number1 / number2;


    }
}
