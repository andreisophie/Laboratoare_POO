package task1;

import task1.document.documentVisitors.TextSegment;
import task1.document.textSegments.DokuWikiVisitor;
import task1.document.textSegments.MarkdownVisitor;

import java.util.List;

/**
 * Uses visitors to parse documents and provide dokuwiki and markdown outputs.
 */
public class WikiGenerator {

    private final List<TextSegment> textSegments;

    public WikiGenerator(List<TextSegment> textSegments) {
        this.textSegments = textSegments;
    }

    public StringBuilder getDokuWikiDocument() {
        StringBuilder text = new StringBuilder();
        DokuWikiVisitor dokuWikiVisitor = new DokuWikiVisitor();
        for (TextSegment textSegment : textSegments) {
            text.append(textSegment.accept(dokuWikiVisitor));
        }
        return text;
    }

    public StringBuilder getMarkdownDocument() {
        StringBuilder text = new StringBuilder();
        MarkdownVisitor markdownVisitor = new MarkdownVisitor();
        for (TextSegment textSegment : textSegments) {
            text.append(textSegment.accept(markdownVisitor));
        }
        return text;
    }
}
