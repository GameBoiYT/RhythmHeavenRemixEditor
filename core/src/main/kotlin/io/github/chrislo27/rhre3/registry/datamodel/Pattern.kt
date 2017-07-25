package io.github.chrislo27.rhre3.registry.datamodel

import io.github.chrislo27.rhre3.entity.ModelEntity

class Pattern(game: Game, id: String, deprecatedIDs: List<String>, name: String,
                  val cues: List<CuePointer>)
    : Datamodel(game, id, deprecatedIDs, name) {

    override fun createEntity(): ModelEntity<*> {
        TODO()
    }

    override fun dispose() {
    }

}