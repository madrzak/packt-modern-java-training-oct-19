package com.application;

import com.network.SiteReader;

/**
 * Created by Lukasz Madrzak on 24/10/2019.
 */
public class Application {

    public static void main(String[] args) {

        SiteReader siteReader = new SiteReader();

        var site = siteReader.read("https://www.google.ie");

        System.out.println(site);

    }

}
