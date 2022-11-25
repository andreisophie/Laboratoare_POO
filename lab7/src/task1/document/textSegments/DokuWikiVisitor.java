package task1.document.textSegments;

import task1.document.documentVisitors.BoldTextSegment;
import task1.document.documentVisitors.ItalicTextSegment;
import task1.document.documentVisitors.PlainTextSegment;
import task1.document.documentVisitors.UrlSegment;

public class DokuWikiVisitor implements DocumentVisitor {
    @Override
    public StringBuilder visit(ItalicTextSegment italicTextSegment) {
        StringBuilder italicText = new StringBuilder();

        italicText.append("*");
        italicText.append(italicTextSegment.getContent());
        italicText.append("*");

        return italicText;
    }

    @Override
    public StringBuilder visit(BoldTextSegment boldTextSegment) {
        StringBuilder boldText = new StringBuilder();

        boldText.append("**");
        boldText.append(boldTextSegment.getContent());
        boldText.append("**");

        return boldText;
    }

    @Override
    public StringBuilder visit(UrlSegment urlSegment) {
        StringBuilder urlText = new StringBuilder();

        urlText.append("[");
        urlText.append(urlSegment.getUrl());
        urlText.append("](");
        urlText.append(urlSegment.getDescription());
        urlText.append(")");

        return urlText;
    }

    @Override
    public StringBuilder visit(PlainTextSegment plainTextSegment) {
        return new StringBuilder(plainTextSegment.getContent());
    }

    @Override
    public StringBuilder getDocument() {
        return null;
    }
}
