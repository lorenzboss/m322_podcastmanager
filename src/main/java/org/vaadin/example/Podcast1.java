package org.vaadin.example;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route("/podcast1")
@PageTitle("Podcast")
public class Podcast1 extends VerticalLayout {

    public Podcast1() {
        addClassName("mainView");
        setSizeFull();

        Image vaadinIcon = new Image("/icons/vaadin_icon.png", "Vaadin Logo");
        vaadinIcon.setHeight("40%");

        H1 mainHeader = new H1("Podcast1");
        mainHeader.addClassName("mainHeader");

        Image homeIcon = new Image("/icons/home_icon.png", "Home Icon");
        homeIcon.setHeight("50%");
        homeIcon.setClassName("homeIcon");
        homeIcon.addClickListener(event -> getUI().ifPresent(ui -> ui.navigate(Homepage.class)));


        Div headerLeft = new Div(vaadinIcon);
        headerLeft.addClassName("headerLeft");

        Div headerCenter = new Div(mainHeader);
        headerCenter.addClassName("headerCenter");


        Div headerRight = new Div(homeIcon);
        headerRight.addClassName("headerRight");

        HorizontalLayout header = new HorizontalLayout(headerLeft, headerCenter, headerRight);
        header.addClassName("header");



        H3 navHeaderText = new H3("Weitere Podcasts");
        navHeaderText.addClassName("navHeaderText");

        Div navHeader = new Div(navHeaderText);
        navHeader.addClassName("navHeader");

        Image navPodcast1 = new Image("/images/1/cover.jpeg", "");
        navPodcast1.addClassName("navPodcast");

        Image navPodcast2 = new Image("/images/2/cover.jpeg", "");
        navPodcast2.addClassName("navPodcast");

        Image navPodcast3 = new Image("/images/3/cover.jpeg", "");
        navPodcast3.addClassName("navPodcast");

        Image navPodcast4 = new Image("/images/4/cover.jpeg", "");
        navPodcast4.addClassName("navPodcast");

        Image navPodcast5 = new Image("/images/5/cover.jpeg", "");
        navPodcast5.addClassName("navPodcast");


        VerticalLayout nav = new VerticalLayout(navHeader, navPodcast1, navPodcast2, navPodcast3, navPodcast4, navPodcast5);
        nav.setWidth("12%");
        nav.addClassName("nav");





        Image cover = new Image("/images/1/podcast1.jpeg", "");
        cover.addClassName("cover");




        VerticalLayout section1 = new VerticalLayout();
        section1.addClassName("section1");


        VerticalLayout description = new VerticalLayout();
        description.addClassName("description");

        VerticalLayout artists = new VerticalLayout();
        artists.addClassName("artists");











        HorizontalLayout bodyContent = new HorizontalLayout(nav, section1, description, artists);
        bodyContent.setSizeFull();

        bodyContent.getStyle().set("padding", "0 15px 15px 15px");

        VerticalLayout mainViewBox = new VerticalLayout(header, bodyContent);
        mainViewBox.addClassName("mainViewBox");

        add(mainViewBox);
    }
}
