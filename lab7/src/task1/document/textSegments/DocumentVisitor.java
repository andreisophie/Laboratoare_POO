package task1.document.textSegments;

import task1.document.documentVisitors.BoldTextSegment;
import task1.document.documentVisitors.ItalicTextSegment;
import task1.document.documentVisitors.PlainTextSegment;
import task1.document.documentVisitors.UrlSegment;

public interface DocumentVisitor {
    StringBuilder visit(ItalicTextSegment italicTextSegment);

    StringBuilder visit(BoldTextSegment boldTextSegment);

    StringBuilder visit(UrlSegment urlSegment);

    StringBuilder visit(PlainTextSegment plainTextSegment);

    StringBuilder getDocument();
}
