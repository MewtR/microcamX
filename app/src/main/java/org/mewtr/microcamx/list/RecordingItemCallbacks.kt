/*
 * SPDX-FileCopyrightText: 2021-2024 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.mewtr.microcamx.list

import org.mewtr.microcamx.models.Recording

interface RecordingItemCallbacks {
    fun onPlay(recording: Recording)
    fun onShare(recording: Recording)
    fun onDelete(recording: Recording)
    fun onRename(recording: Recording)
}
