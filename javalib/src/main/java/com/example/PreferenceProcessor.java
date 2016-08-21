package com.example;

import com.google.auto.service.AutoService;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;

/**
 * @author QBW
 * @createtime 2016/08/13 17:54
 * @company 9zhitx.com
 * @description
 */

@SupportedSourceVersion(SourceVersion.RELEASE_7)
@AutoService(Processor.class)
public class PreferenceProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {

        processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, "[log]Just for test");

        return true;
    }
}
