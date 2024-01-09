package org.vaadin.example;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;
import elemental.json.Json;

import java.io.IOException;
import java.io.InputStream;

@Route("/add")
@PageTitle("Add Podcast")
public class AddPodcast extends VerticalLayout {

    public AddPodcast() {
        addClassName("mainView");
        setSizeFull();

        // Header
        Image vaadinIcon = new Image("/icons/vaadin_icon.png", "Vaadin Logo");
        vaadinIcon.setHeight("40%");

        H1 mainHeader = new H1("Add Podcast");
        mainHeader.addClassName("mainHeader");

        Image homeIcon = new Image("/icons/home_icon.png", "Home Icon");
        homeIcon.setHeight("50%");
        homeIcon.setClassName("homeIcon");
        homeIcon.addClickListener(event -> {
            getUI().ifPresent(ui -> ui.navigate(Homepage.class));
        });


        Div headerLeft = new Div(vaadinIcon);
        headerLeft.addClassName("headerLeft");

        Div headerCenter = new Div(mainHeader);
        headerCenter.addClassName("headerCenter");

        Div headerRight = new Div(homeIcon);
        headerRight.addClassName("headerRight");

        HorizontalLayout header = new HorizontalLayout(headerLeft, headerCenter, headerRight);
        header.addClassName("header");


        // bodyLeft
        TextArea nameInputField = new TextArea("Name:");
        nameInputField.addClassName("nameInputField");

        TextArea descriptionInputField = new TextArea("Beschreibung:");
        descriptionInputField.addClassName("descriptionInputField");

        VerticalLayout bodyLeft = new VerticalLayout(nameInputField, descriptionInputField);


        // bodyCenter
        Paragraph artistsLabel = new Paragraph("Artists:");
        artistsLabel.addClassName("artistsLabel");


        Button artistsListArtistRemoveButton1 = new Button(new Icon(VaadinIcon.CLOSE_SMALL));
        artistsListArtistRemoveButton1.addThemeVariants(ButtonVariant.LUMO_ICON);
        artistsListArtistRemoveButton1.setTooltipText("Delete Artist");
        artistsListArtistRemoveButton1.addClassName("artistsListArtistRemoveButton");

        Image artistsListArtist1Image = new Image("/images/new/artist1.jpeg", "");
        artistsListArtist1Image.addClassName("artistsListArtistImage");

        Paragraph artistsListArtist1Name = new Paragraph("Artist 1");
        artistsListArtist1Name.addClassName("artistsListArtistName");

        HorizontalLayout artistsListArtist1 = new HorizontalLayout(artistsListArtist1Image, artistsListArtist1Name, artistsListArtistRemoveButton1);
        artistsListArtist1.addClassName("artistsListArtist");
        artistsListArtist1.setSizeFull();


        Button artistsListArtistRemoveButton2 = new Button(new Icon(VaadinIcon.CLOSE_SMALL));
        artistsListArtistRemoveButton2.addThemeVariants(ButtonVariant.LUMO_ICON);
        artistsListArtistRemoveButton2.setTooltipText("Delete Artist");
        artistsListArtistRemoveButton2.addClassName("artistsListArtistRemoveButton");

        Image artistsListArtist2Image = new Image("/images/new/artist2.jpeg", "");
        artistsListArtist2Image.addClassName("artistsListArtistImage");

        Paragraph artistsListArtist2Name = new Paragraph("Artist 2");
        artistsListArtist2Name.addClassName("artistsListArtistName");

        HorizontalLayout artistsListArtist2 = new HorizontalLayout(artistsListArtist2Image, artistsListArtist2Name, artistsListArtistRemoveButton2);
        artistsListArtist2.addClassName("artistsListArtist");
        artistsListArtist2.setSizeFull();


        Button artistsListArtistRemoveButton3 = new Button(new Icon(VaadinIcon.CLOSE_SMALL));
        artistsListArtistRemoveButton3.addThemeVariants(ButtonVariant.LUMO_ICON);
        artistsListArtistRemoveButton3.setTooltipText("Delete Artist");
        artistsListArtistRemoveButton3.addClassName("artistsListArtistRemoveButton");

        Image artistsListArtist3Image = new Image("/images/new/artist3.jpeg", "");
        artistsListArtist3Image.addClassName("artistsListArtistImage");

        Paragraph artistsListArtist3Name = new Paragraph("Artist 3");
        artistsListArtist3Name.addClassName("artistsListArtistName");

        HorizontalLayout artistsListArtist3 = new HorizontalLayout(artistsListArtist3Image, artistsListArtist3Name, artistsListArtistRemoveButton3);
        artistsListArtist3.addClassName("artistsListArtist");
        artistsListArtist3.setSizeFull();


        VerticalLayout artistsListArtists = new VerticalLayout(artistsListArtist1, artistsListArtist2, artistsListArtist3);
        artistsListArtists.addClassName("artistsListArtists");

        Scroller artistsList = new Scroller();
        artistsList.setContent(artistsListArtists);
        artistsList.setWidthFull();
        artistsList.addClassName("artistsList");


        TextField createArtistInputField = new TextField("Name: ");

        Image createArtistImage = new Image("/images/new/default.jpeg", "");
        createArtistImage.addClassName("createArtistImage");

        Button createArtistButton = new Button("Add Artist", new Icon(VaadinIcon.PLUS));
        createArtistButton.setTooltipText("Add Artist");
        createArtistButton.addClassName("createArtistButton");


        HorizontalLayout createArtist = new HorizontalLayout(createArtistInputField, createArtistImage);
        createArtist.addClassName("createArtist");


        MemoryBuffer buffer1 = new MemoryBuffer();
        Upload createArtistImageUpload = new Upload(buffer1);
        createArtistImageUpload.addClassName("createArtistImageUpload");
        createArtistImageUpload.setAcceptedFileTypes("image/*");

        createArtistImageUpload.addSucceededListener(event -> {
            try (InputStream inputStream = buffer1.getInputStream()) {
                UI.getCurrent().access(() -> {
                    createArtistImage.getElement().getThemeList().clear();
                    createArtistImage.getElement().getThemeList().add("image");
                    createArtistImage.getElement().setAttribute("src", new StreamResource("image.png", () -> inputStream));
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        createArtistButton.addClickListener(event -> {
            createArtistImage.getElement().setAttribute("src", "/images/new/default.jpeg");
            createArtistImageUpload.getElement().setPropertyJson("files", Json.createArray());
            createArtistInputField.clear();
        });


        VerticalLayout artistsSelection = new VerticalLayout(artistsList, createArtist, createArtistImageUpload, createArtistButton);
        artistsSelection.addClassName("artistsSelection");

        VerticalLayout bodyCenter = new VerticalLayout(artistsLabel, artistsSelection);
        bodyCenter.addClassName("bodyCenter");


        // BodyRight
        Paragraph coverLabel = new Paragraph("Cover:");
        coverLabel.addClassName("coverLabel");

        Image coverImage = new Image("/images/new/default.jpeg", "");
        coverImage.addClassName("coverImage");


        MemoryBuffer buffer2 = new MemoryBuffer();
        Upload coverImageUpload = new Upload(buffer2);
        coverImageUpload.addClassName("coverImageUpload");
        coverImageUpload.setAcceptedFileTypes("image/*");

        coverImageUpload.addSucceededListener(event -> {
            try (InputStream inputStream = buffer2.getInputStream()) {
                UI.getCurrent().access(() -> {
                    coverImage.getElement().getThemeList().clear();
                    coverImage.getElement().getThemeList().add("image");
                    coverImage.getElement().setAttribute("src", new StreamResource("image.png", () -> inputStream));
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        Button cancelButton = new Button("cancel", new Icon(VaadinIcon.CLOSE_SMALL));
        cancelButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY, ButtonVariant.LUMO_ERROR);
        cancelButton.addClassName("csButton");
        cancelButton.addClickListener(event -> {
            UI.getCurrent().access(() -> {
                UI.getCurrent().navigate(Homepage.class);
            });
        });

        Button saveButton = new Button("save", new Icon(VaadinIcon.CHECK));
        saveButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY, ButtonVariant.LUMO_SUCCESS);
        saveButton.addClassName("csButton");
        saveButton.addClickListener(event -> {
            UI.getCurrent().access(() -> {
                UI.getCurrent().navigate(Homepage.class);
            });
        });


        HorizontalLayout buttons = new HorizontalLayout(cancelButton, saveButton);
        buttons.addClassName("buttons");


        VerticalLayout bodyRight = new VerticalLayout(coverLabel, coverImage, coverImageUpload, buttons);


        HorizontalLayout bodyContent = new HorizontalLayout(bodyLeft, bodyCenter, bodyRight);
        bodyContent.setSizeFull();
        bodyContent.setHeight("70%");

        bodyContent.getStyle().set("padding", "0 15px 15px 15px");

        VerticalLayout mainViewBox = new VerticalLayout(header, bodyContent);
        mainViewBox.addClassName("mainViewBox");

        add(mainViewBox);
    }
}
