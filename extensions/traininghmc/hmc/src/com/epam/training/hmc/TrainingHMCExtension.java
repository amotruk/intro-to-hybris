package com.epam.training.hmc;

import de.hybris.platform.hmc.AbstractEditorMenuChip;
import de.hybris.platform.hmc.AbstractExplorerMenuTreeNodeChip;
import de.hybris.platform.hmc.EditorTabChip;
import de.hybris.platform.hmc.extension.HMCExtension;
import de.hybris.platform.hmc.extension.MenuEntrySlotEntry;
import de.hybris.platform.hmc.generic.ClipChip;
import de.hybris.platform.hmc.generic.ToolbarActionChip;
import de.hybris.platform.hmc.webchips.Chip;
import de.hybris.platform.hmc.webchips.DisplayState;

import java.util.*;

public class TrainingHMCExtension extends HMCExtension {

    /** Path to the resource bundles. */
    public final static String RESOURCE_PATH = "com.epam.training.hmc.locales";

    @Override
    public List<AbstractExplorerMenuTreeNodeChip> getTreeNodeChips(final DisplayState displayState, final Chip parent)
    {
        return Collections.EMPTY_LIST;
    }

    /**
     * @see HMCExtension#getMenuEntrySlotEntries(de.hybris.platform.hmc.webchips.DisplayState,
     *      de.hybris.platform.hmc.webchips.Chip)
     */
    @Override
    public List<MenuEntrySlotEntry> getMenuEntrySlotEntries(final DisplayState displayState, final Chip parent)
    {
        return Collections.EMPTY_LIST;
    }

    /**
     * @see HMCExtension#getSectionChips(de.hybris.platform.hmc.webchips.DisplayState,
     *      de.hybris.platform.hmc.generic.ClipChip)
     */
    @Override
    public List<ClipChip> getSectionChips(final DisplayState displayState, final ClipChip parent)
    {
        return Collections.EMPTY_LIST;
    }

    @Override
    public List<EditorTabChip> getEditorTabChips(final DisplayState displayState, final AbstractEditorMenuChip parent)
    {
        return Collections.EMPTY_LIST;
    }

    /**
     * @see HMCExtension#getToolbarActionChips(de.hybris.platform.hmc.webchips.DisplayState,
     *      de.hybris.platform.hmc.webchips.Chip)
     */
    @Override
    public List<ToolbarActionChip> getToolbarActionChips(final DisplayState displayState, final Chip parent)
    {
        return Collections.EMPTY_LIST;
    }

    @Override
    public ResourceBundle getLocalizeResourceBundle(final Locale locale)
    {
        return null;
    }

    @Override
    public String getResourcePath()
    {
        return RESOURCE_PATH;
    }
}
