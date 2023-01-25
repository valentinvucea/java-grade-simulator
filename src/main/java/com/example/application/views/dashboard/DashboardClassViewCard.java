package com.example.application.views.dashboard;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.theme.lumo.LumoUtility.AlignItems;
import com.vaadin.flow.theme.lumo.LumoUtility.Background;
import com.vaadin.flow.theme.lumo.LumoUtility.BorderRadius;
import com.vaadin.flow.theme.lumo.LumoUtility.Display;
import com.vaadin.flow.theme.lumo.LumoUtility.FlexDirection;
import com.vaadin.flow.theme.lumo.LumoUtility.FontSize;
import com.vaadin.flow.theme.lumo.LumoUtility.FontWeight;
import com.vaadin.flow.theme.lumo.LumoUtility.JustifyContent;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;
import com.vaadin.flow.theme.lumo.LumoUtility.Overflow;
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;
import com.vaadin.flow.theme.lumo.LumoUtility.TextColor;
import com.vaadin.flow.theme.lumo.LumoUtility.Width;

public class DashboardClassViewCard extends ListItem {

    public DashboardClassViewCard(String category, String grade) {
        addClassNames(Background.CONTRAST_5, Display.FLEX, FlexDirection.COLUMN, AlignItems.START, Padding.MEDIUM,
                BorderRadius.LARGE);

        Div div = new Div();
        div.addClassNames(Background.CONTRAST, Display.FLEX, AlignItems.CENTER, JustifyContent.CENTER,
                Margin.Bottom.MEDIUM, Overflow.HIDDEN, BorderRadius.MEDIUM, Width.FULL);
        div.setHeight("160px");

        Div divClassTitleWrapper = new Div();
        divClassTitleWrapper.addClassNames(Background.PRIMARY, Display.FLEX, AlignItems.CENTER, JustifyContent.CENTER,
                Margin.NONE, Overflow.HIDDEN, BorderRadius.MEDIUM, Width.FULL);
        divClassTitleWrapper.setHeight("160px");
        
        Span gradeShow = new Span();
        gradeShow.addClassNames(FontSize.XXXLARGE, FontWeight.BOLD, TextColor.BODY);
        gradeShow.setText(grade);
        
        divClassTitleWrapper.add(gradeShow);
        
        div.add(divClassTitleWrapper);
        
//        Image image = new Image();
//        image.setWidth("100%");
//        image.setSrc(url);
//        image.setAlt(text);
//
//        div.add(image);

        Span header = new Span();
        header.addClassNames(FontSize.XXLARGE, FontWeight.SEMIBOLD);
        header.setText(category);

//        Span subtitle = new Span();
//        subtitle.addClassNames(FontSize.SMALL, TextColor.SECONDARY);
//        subtitle.setText("Card subtitle");
//
//        Paragraph description = new Paragraph(
//                "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut.");
//        description.addClassName(Margin.Vertical.MEDIUM);

        Span badge = new Span();
        badge.getElement().setAttribute("theme", "badge");
        badge.setText("Simulate New Grade");

        add(div, header, badge);

    }
}
