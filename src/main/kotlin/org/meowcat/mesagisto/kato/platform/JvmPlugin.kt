package org.meowcat.mesagisto.kato.platform

import kotlinx.coroutines.CoroutineScope
import org.bukkit.plugin.java.JavaPlugin
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

abstract class JvmPlugin : CoroutineScope {
  override val coroutineContext: CoroutineContext = EmptyCoroutineContext

  open suspend fun onEnable(): Result<Unit> = Result.success(Unit)
  open suspend fun onDisable(): Result<Unit> = Result.success(Unit)
  open suspend fun onLoad(bukkit: JavaPlugin): Result<Unit> = Result.success(Unit)
}