package coop.uwutech.orto.android.ui.features

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import coil.annotation.ExperimentalCoilApi
import coop.uwutech.orto.android.ui.components.NoteItem
import coop.uwutech.orto.android.ui.components.state.ManagementResourceState
import coop.uwutech.orto.shared.domain.model.NoteItemState
import coop.uwutech.orto.shared.features.detail.mvi.TagDetailContract
import coop.uwutech.orto.shared.features.detail.mvi.TagDetailViewModel

@ExperimentalCoilApi
@Composable
fun TagDetailScreen(
    onNoteClick: (Long) -> Unit,
    viewModel: TagDetailViewModel
) {
    val state by viewModel.uiState.collectAsState()
    val scaffoldState: ScaffoldState = rememberScaffoldState()

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { ActionBar( name = state.tagName ) }
    ) { padding ->
        ManagementResourceState(
            resourceState = state.notes,
            successView = { notes ->
                checkNotNull(notes)
                NotesList(
                    notes = notes,
                    onNoteClick = onNoteClick
                )
            },
            modifier = Modifier.padding(padding),
            onTryAgain = { viewModel.setEvent(TagDetailContract.Event.Retry) },
            onCheckAgain = { viewModel.setEvent(TagDetailContract.Event.Retry) },
        )
    }
}

@ExperimentalCoilApi
@Composable
fun NotesList(
    notes: List<NoteItemState>,
    onNoteClick: (Long) -> Unit
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top
    ) {
        items(notes) { state ->
            NoteItem(
                state = state,
                onClick = { onNoteClick(state.id) }
            )
        }
    }
}