package com.example.pdaprocessor;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;

@SupportedAnnotationTypes("com.example.autoparcel.AutoParcel")
public class PersonalDataAnnotationProcessor extends AbstractProcessor {

    @Override
    public synchronized void init(ProcessingEnvironment env){ }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment env) { return true; }

    @Override
    public Set<String> getSupportedAnnotationTypes() { return null; }

    @Override
    public SourceVersion getSupportedSourceVersion() { return null; }
}