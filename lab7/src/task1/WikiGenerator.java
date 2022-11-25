package task1;

import task1.document.documentVisitors.TextSegment;
import task1.document.textSegments.DokuWikiVisitor;

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
        // TODO apply dokuwiki visitor on the text segments
        StringBuilder text = new StringBuilder();
        DokuWikiVisitor dokuWikiVisitor = new DokuWikiVisitor();
        for (TextSegment textSegment : textSegments) {
            text.append(textSegment.accept(dokuWikiVisitor));
        }
        return null;
    }

    public StringBuilder getMarkdownDocument() {
        // TODO apply Markdown visitor on the text segments
        return null;
    }
}
