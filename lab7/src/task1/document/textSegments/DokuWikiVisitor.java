package task1.document.textSegments;

import task1.document.documentVisitors.BoldTextSegment;
import task1.document.documentVisitors.ItalicTextSegment;
import task1.document.documentVisitors.PlainTextSegment;
import task1.document.documentVisitors.UrlSegment;

public class DokuWikiVisitor implements DocumentVisitor {
    @Override
    public void visit(ItalicTextSegment italicTextSegment) {

    }

    @Override
    public void visit(BoldTextSegment boldTextSegment) {

    }

    @Override
    public void visit(UrlSegment urlSegment) {

    }

    @Override
    public void visit(PlainTextSegment plainTextSegment) {

    }

    @Override
    public StringBuilder getDocument() {
        return null;
    }
}
