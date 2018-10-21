package org.jetbrains.samples

import java.util.concurrent.Executors

private val IO_EXECUTOR = Executors.newSingleThreadExecutor()

actual fun runOnIoThread(f: () -> Unit) {
  IO_EXECUTOR.execute(f)
}
