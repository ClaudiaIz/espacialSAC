package com.espacialSac.pe.utilities.website;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;

public class WebSite {
    @Steps(shared = true)
    PageObject espacialSac;

    @Step("Navegar al sitio Web")
    public void mavigateTo(String url){
        espacialSac.setDefaultBaseUrl(url);
        espacialSac.open();
    }
}
