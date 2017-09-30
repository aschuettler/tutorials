package com.umeshawasthi.failureanalyzer;

import org.springframework.beans.factory.BeanNotOfRequiredTypeException;
import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by umesh on 6/28/17.
 */
public class CustomFailureAnalyzer extends AbstractFailureAnalyzer<BeanNotOfRequiredTypeException> {

    /**
     * Returns an analysis of the given {@code failure}, or {@code null} if no analysis
     * was possible.
     *
     * @param rootFailure the root failure passed to the analyzer
     * @param cause       the actual found cause
     * @return the analysis or {@code null}
     */
    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, BeanNotOfRequiredTypeException cause) {
        String message ="####################### This is a custom fail Message ################ %n"+
                getDescription(cause);
        return new FailureAnalysis(message , (String)null, cause);
    }

    private String getDescription(BeanNotOfRequiredTypeException ex) {

        StringWriter description = new StringWriter();
        PrintWriter printer = new PrintWriter(description);
        printer.printf(
                "The bean %s could not be injected"
                        + "due to %s",
                ex.getBeanName(), ex.getRequiredType().getName());
        return description.toString();
    }
}
