package org.vaadin.example;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout implements BeforeEnterObserver {

    public MainView() {
        Paragraph paragraph = new Paragraph("Redirecting...");
        add(paragraph);
    }

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        UI.getCurrent().access(() -> {
            UI.getCurrent().navigate(Homepage.class);
        });
    }
}
