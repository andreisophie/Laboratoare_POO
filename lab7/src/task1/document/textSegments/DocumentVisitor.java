package task1.document.textSegments;

import task1.document.documentVisitors.BoldTextSegment;
import task1.document.documentVisitors.ItalicTextSegment;
import task1.document.documentVisitors.PlainTextSegment;
import task1.document.documentVisitors.UrlSegment;

public interface DocumentVisitor {
    public void visit(ItalicTextSegment italicTextSegment);

    public void visit(BoldTextSegment boldTextSegment);

    public void visit(UrlSegment urlSegment);

    public void visit(PlainTextSegment plainTextSegment);

    public StringBuilder getDocument();
}
