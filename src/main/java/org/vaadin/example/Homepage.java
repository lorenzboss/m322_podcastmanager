package org.vaadin.example;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@Route("/home")
@PageTitle("Homepage")
public class Homepage extends VerticalLayout {

    public Homepage() {
        addClassName("mainView");
        setSizeFull();

        Image vaadinIcon = new Image("/icons/vaadin_icon.png", "Vaadin Logo");
        vaadinIcon.setHeight("40%");

        H1 mainHeader = new H1("Homepage");
        mainHeader.addClassName("mainHeader");


        Div headerLeft = new Div(vaadinIcon);
        headerLeft.addClassName("headerLeft");

        Div headerCenter = new Div(mainHeader);
        headerCenter.addClassName("headerCenter");

        Div headerRight = new Div();
        headerRight.addClassName("headerRight");

        HorizontalLayout header = new HorizontalLayout(headerLeft, headerCenter, headerRight);
        header.addClassName("header");



        H2 aboutMeHeader = new H2("Über mich");
        aboutMeHeader.addClassName("aboutMeHeader");

        Image aboutMeImage = new Image("/images/lorenz.jpeg", "");
        aboutMeImage.addClassName("aboutMeImage");

        Paragraph aboutMeText = new Paragraph("Mein Name ist Lorenz Boss. Diese Seite ist ein Projekt, welches ich in der Schule BBZBL Pratteln (Baselland) erstellt habe.");
        aboutMeText.addClassName("aboutMeText");

        VerticalLayout aboutMe = new VerticalLayout(aboutMeHeader, aboutMeImage, aboutMeText);
        aboutMe.setWidth("30%");
        aboutMe.addClassName("aboutMe");




        Paragraph podcastsFooterMenuTextInfo1 = new Paragraph("podcasts: 5");
        podcastsFooterMenuTextInfo1.addClassName("podcastsFooterMenuTextInfo");
        Paragraph podcastsFooterMenuTextInfo2 = new Paragraph("max podcasts: 6");
        podcastsFooterMenuTextInfo2.addClassName("podcastsFooterMenuTextInfo");
        RouterLink podcastsFooterMenuAddPodcast = new RouterLink("add Podcast", AddPodcast.class);
        podcastsFooterMenuAddPodcast.addClassName("podcastsFooterMenuTextInfo");

        Div podcastsFooterMenuTextBox = new Div(podcastsFooterMenuTextInfo1, podcastsFooterMenuTextInfo2, podcastsFooterMenuAddPodcast);
        podcastsFooterMenuTextBox.addClassName("podcastsFooterMenuTextBox");


        Div podcastsFooterMenu = new Div(podcastsFooterMenuTextBox);
        podcastsFooterMenu.addClassName("podcastsFooterMenu");
        podcastsFooterMenu.setSizeFull();




        Image podcastsFooterLegalInfosIconsIcon1 = new Image("/icons/linkedin_icon.png", "");
        podcastsFooterLegalInfosIconsIcon1.addClassName("podcastsFooterLegalInfosIconsIcon1");
        podcastsFooterLegalInfosIconsIcon1.addClickListener(event -> {
            UI.getCurrent().getPage().executeJs("window.location.href = 'https://www.linkedin.com';");
        });

        Image podcastsFooterLegalInfosIconsIcon2 = new Image("/icons/website_icon.png", "");
        podcastsFooterLegalInfosIconsIcon2.addClassName("podcastsFooterLegalInfosIconsIcon2");
        podcastsFooterLegalInfosIconsIcon2.addClickListener(event -> {
            UI.getCurrent().getPage().executeJs("window.location.href = 'https://me.lorenzboss.com';");
        });

        Image podcastsFooterLegalInfosIconsIcon3 = new Image("/icons/instagram_icon.png", "");
        podcastsFooterLegalInfosIconsIcon3.addClassName("podcastsFooterLegalInfosIconsIcon3");
        podcastsFooterLegalInfosIconsIcon3.addClickListener(event -> {
            UI.getCurrent().getPage().executeJs("window.location.href = 'https://www.instagram.com';");
        });


        HorizontalLayout podcastsFooterLegalInfosIcons = new HorizontalLayout(podcastsFooterLegalInfosIconsIcon1, podcastsFooterLegalInfosIconsIcon2, podcastsFooterLegalInfosIconsIcon3);
        podcastsFooterLegalInfosIcons.addClassName("podcastsFooterLegalInfosIcons");

        Paragraph podcastsFooterLegalInfosText = new Paragraph("Alle Rechte vorbehalten ©-2024 | Lorenz Boss");
        podcastsFooterLegalInfosText.addClassName("podcastsFooterLegalInfosText");


        Div podcastsFooterLegalInfos = new Div(podcastsFooterLegalInfosIcons, podcastsFooterLegalInfosText);
        podcastsFooterLegalInfos.addClassName("podcastsFooterLegalInfos");
        podcastsFooterLegalInfos.setSizeFull();





        HorizontalLayout podcastsFooter = new HorizontalLayout(podcastsFooterMenu, podcastsFooterLegalInfos);
        podcastsFooter.setSizeFull();
        podcastsFooter.setHeight("20%");


        Image podcastsOverviewPodcast1Image = new Image("/images/1/cover.jpeg", "");
        podcastsOverviewPodcast1Image.addClassName("podcastsOverviewPodcast1Image");

        Paragraph podcastsOverviewPodcast1Text = new Paragraph("Podcast 1");
        podcastsOverviewPodcast1Text.addClassName("podcastsOverviewPodcast1Text");

        Div podcastsOverviewPodcast1 = new Div(podcastsOverviewPodcast1Image, podcastsOverviewPodcast1Text);
        podcastsOverviewPodcast1.addClassName("podcastsOverviewPodcast1");

        podcastsOverviewPodcast1.addClickListener(event -> {
            getUI().ifPresent(ui -> ui.navigate(AddPodcast.class));
        });


        Image podcastsOverviewPodcast2Image = new Image("/images/2/cover.jpeg", "");
        podcastsOverviewPodcast2Image.addClassName("podcastsOverviewPodcast2Image");

        Paragraph podcastsOverviewPodcast2Text = new Paragraph("Podcast 2");
        podcastsOverviewPodcast2Text.addClassName("podcastsOverviewPodcast2Text");

        Div podcastsOverviewPodcast2 = new Div(podcastsOverviewPodcast2Image, podcastsOverviewPodcast2Text);
        podcastsOverviewPodcast2.addClassName("podcastsOverviewPodcast2");


        Image podcastsOverviewPodcast3Image = new Image("/images/3/cover.jpeg", "");
        podcastsOverviewPodcast3Image.addClassName("podcastsOverviewPodcast3Image");

        Paragraph podcastsOverviewPodcast3Text = new Paragraph("Podcast 3");
        podcastsOverviewPodcast3Text.addClassName("podcastsOverviewPodcast3Text");

        Div podcastsOverviewPodcast3 = new Div(podcastsOverviewPodcast3Image, podcastsOverviewPodcast3Text);
        podcastsOverviewPodcast3.addClassName("podcastsOverviewPodcast3");


        Image podcastsOverviewPodcast4Image = new Image("/images/4/cover.jpeg", "");
        podcastsOverviewPodcast4Image.addClassName("podcastsOverviewPodcast4Image");

        Paragraph podcastsOverviewPodcast4Text = new Paragraph("Podcast 4");
        podcastsOverviewPodcast4Text.addClassName("podcastsOverviewPodcast4Text");

        Div podcastsOverviewPodcast4 = new Div(podcastsOverviewPodcast4Image, podcastsOverviewPodcast4Text);
        podcastsOverviewPodcast4.addClassName("podcastsOverviewPodcast4");


        Image podcastsOverviewPodcast5Image = new Image("/images/5/cover.jpeg", "");
        podcastsOverviewPodcast5Image.addClassName("podcastsOverviewPodcast5Image");

        Paragraph podcastsOverviewPodcast5Text = new Paragraph("Podcast 5");
        podcastsOverviewPodcast5Text.addClassName("podcastsOverviewPodcast5Text");

        Div podcastsOverviewPodcast5 = new Div(podcastsOverviewPodcast5Image, podcastsOverviewPodcast5Text);
        podcastsOverviewPodcast5.addClassName("podcastsOverviewPodcast5");




        FlexLayout podcastsOverview = new FlexLayout(podcastsOverviewPodcast1, podcastsOverviewPodcast2, podcastsOverviewPodcast3, podcastsOverviewPodcast4, podcastsOverviewPodcast5);
        podcastsOverview.setFlexWrap(FlexLayout.FlexWrap.WRAP);
        podcastsOverview.addClassName("podcastsOverview");
        podcastsOverview.setSizeFull();





        VerticalLayout podcasts = new VerticalLayout(podcastsOverview, podcastsFooter);
        podcasts.setPadding(false);



        HorizontalLayout bodyContent = new HorizontalLayout(aboutMe, podcasts);
        bodyContent.setSizeFull();

        bodyContent.getStyle().set("padding", "0 15px 15px 15px");

        VerticalLayout mainViewBox = new VerticalLayout(header, bodyContent);
        mainViewBox.addClassName("mainViewBox");

        add(mainViewBox);
    }
}
