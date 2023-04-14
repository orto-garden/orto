package garden.orto.android.ui.utils

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import garden.orto.shared.domain.model.NoteState

class SampleNoteCardProvider : PreviewParameterProvider<NoteState> {
    override val values = sequenceOf(
        NoteState(0, "title1", "url1", "img1", "content1", listOf("tag1", "tag2")),
        NoteState(1, "title2", "url2", "img2", "content2", listOf("tag3", "tag4"))
    )
}

class SampleTagLabelProvider : PreviewParameterProvider<String> {
    override val values = sequenceOf("tag1", "tag2", "tag3", "tag4")
}