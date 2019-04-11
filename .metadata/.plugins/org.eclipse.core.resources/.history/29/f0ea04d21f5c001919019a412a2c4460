	package com.fr.adaming.view;

import java.util.regex.*;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.*;


public class ValidatorBean implements Validator
{

    private static final String EMAIL_REGEXP =
            "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    @Override
    public void validate(FacesContext context, UIComponent c, Object val) throws ValidatorException
    {
        String email = (String) val;
        Pattern mask = null;
        mask = Pattern.compile(EMAIL_REGEXP);
        Matcher matcher = mask.matcher(email);

        if (!matcher.matches()) {
            FacesMessage message = new FacesMessage();
            message.setDetail("Please enter a valid email");
            message.setSummary("Il semblerait que votre e-mail n'est pas au bon format");
            message.setSeverity(FacesMessage.SEVERITY_WARN);
            throw new ValidatorException(message);
        }
    }
}