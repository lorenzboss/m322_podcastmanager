package org.vaadin.example;

import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route("/podcast4")
@PageTitle("Podcast4")
public class Podcast4 extends VerticalLayout {

    public Podcast4() {
        addClassName("mainView");
        setSizeFull();

        Image vaadinIcon = new Image("/icons/vaadin_icon.png", "Vaadin Logo");
        vaadinIcon.setHeight("40%");

        H1 mainHeader = new H1("Hobbylos");
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
        navPodcast1.addClickListener(event -> {
            getUI().ifPresent(ui -> ui.navigate(Podcast1.class));
        });

        Image navPodcast2 = new Image("/images/2/cover.jpeg", "");
        navPodcast2.addClassName("navPodcast");
        navPodcast2.addClickListener(event -> {
            getUI().ifPresent(ui -> ui.navigate(Podcast2.class));
        });

        Image navPodcast3 = new Image("/images/3/cover.jpeg", "");
        navPodcast3.addClassName("navPodcast");
        navPodcast3.addClickListener(event -> {
            getUI().ifPresent(ui -> ui.navigate(Podcast3.class));
        });

        Image navPodcast4 = new Image("/images/4/cover.jpeg", "");
        navPodcast4.addClassName("navPodcast");
        navPodcast4.addClickListener(event -> {
            getUI().ifPresent(ui -> ui.navigate(Podcast4.class));
        });

        Image navPodcast5 = new Image("/images/5/cover.jpeg", "");
        navPodcast5.addClassName("navPodcast");
        navPodcast5.addClickListener(event -> {
            getUI().ifPresent(ui -> ui.navigate(Podcast5.class));
        });


        VerticalLayout nav = new VerticalLayout(navHeader, navPodcast1, navPodcast2, navPodcast3, navPodcast4, navPodcast5);
        nav.setWidth("10%");
        nav.addClassName("nav");


        Image cover = new Image("/images/4/cover.jpeg", "");
        cover.addClassName("cover");


        H2 ratingHeader = new H2("Rating");
        ratingHeader.addClassName("ratingHeader");

        Icon interactiveStar1 = VaadinIcon.STAR.create();
        interactiveStar1.setSize("40px");
        interactiveStar1.addClassName("interactiveStar");

        Icon interactiveStar2 = VaadinIcon.STAR.create();
        interactiveStar2.setSize("40px");
        interactiveStar2.addClassName("interactiveStar");

        Icon interactiveStar3 = VaadinIcon.STAR.create();
        interactiveStar3.setSize("40px");
        interactiveStar3.addClassName("interactiveStar");

        Icon interactiveStar4 = VaadinIcon.STAR.create();
        interactiveStar4.setSize("40px");
        interactiveStar4.addClassName("interactiveStar");

        Icon interactiveStar5 = VaadinIcon.STAR.create();
        interactiveStar5.setSize("40px");
        interactiveStar5.addClassName("interactiveStar");

        HorizontalLayout ratingUser = new HorizontalLayout(interactiveStar1, interactiveStar2, interactiveStar3, interactiveStar4, interactiveStar5);
        ratingUser.addClassName("ratingUser");


        Icon staticStar1 = VaadinIcon.STAR.create();
        staticStar1.addClassName("staticStar");
        staticStar1.setSize("35px");

        Icon staticStar2 = VaadinIcon.STAR.create();
        staticStar2.addClassName("staticStar");
        staticStar2.setSize("35px");

        Icon staticStar3 = VaadinIcon.STAR.create();
        staticStar3.addClassName("staticStar");
        staticStar3.setSize("35px");

        Icon staticStar4 = VaadinIcon.STAR.create();
        staticStar4.addClassName("staticStar");
        staticStar4.setSize("35px");

        Icon staticStar5 = VaadinIcon.STAR_HALF_LEFT_O.create();
        staticStar5.addClassName("staticStar");
        staticStar5.setSize("35px");

        HorizontalLayout staticStars = new HorizontalLayout(staticStar1, staticStar2, staticStar3, staticStar4, staticStar5);
        staticStars.addClassName("staticStars");

        Paragraph staticRating = new Paragraph("4.5");
        staticRating.addClassName("staticRating");


        HorizontalLayout ratingAudience = new HorizontalLayout(staticStars, staticRating);
        ratingAudience.addClassName("ratingAudience");


        VerticalLayout rating = new VerticalLayout(ratingHeader, ratingUser, ratingAudience);
        rating.addClassName("rating");


        VerticalLayout section1 = new VerticalLayout(cover, rating);
        section1.addClassName("section1");
        section1.setWidth("30%");

        Paragraph descriptionText = new Paragraph("\"Hobbylos\" ist ein Spotify Original Podcast, der von Rezo und Julien Bam moderiert wird. Die beiden sprechen über verschiedene Themen aus ihrem Leben, wie zum Beispiel Therapie, Mathematik, Politik und soziale Medien. Der Podcast ist humorvoll und unterhaltsam und bietet auch gelegentlich musikalische Einlagen. Die Episoden sind ungefähr eine Stunde lang und werden jeden Samstag veröffentlicht. Der Podcast ist auf Spotify verfügbar");
        descriptionText.addClassName("descriptionText");

        HorizontalLayout description = new HorizontalLayout(descriptionText);
        description.addClassName("description");
        description.setWidth("40%");


        H2 artistsHeader = new H2("Artists");
        artistsHeader.getStyle().set("margin", "10%");

        Image artist1Image = new Image("/images/4/artist1.jpeg", "");
        artist1Image.addClassName("artistImage");

        Paragraph artist1Name = new Paragraph("Julien Bam");
        artist1Name.addClassName("artistName");

        Image artist2Image = new Image("/images/4/artist2.jpeg", "");
        artist2Image.addClassName("artistImage");

        Paragraph artist2Name = new Paragraph("Rezo");
        artist2Name.addClassName("artistName");

        VerticalLayout artists = new VerticalLayout(artistsHeader, artist1Image, artist1Name, artist2Image, artist2Name);
        artists.addClassName("artists");
        artists.setWidth("20%");


        HorizontalLayout bodyContent = new HorizontalLayout(nav, section1, description, artists);
        bodyContent.setSizeFull();

        bodyContent.getStyle().set("padding", "0 15px 15px 15px");

        VerticalLayout mainViewBox = new VerticalLayout(header, bodyContent);
        mainViewBox.addClassName("mainViewBox");

        add(mainViewBox);
    }
}
