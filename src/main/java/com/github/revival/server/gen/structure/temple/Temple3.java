package com.github.revival.server.gen.structure.temple;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class Temple3 {

    /*
     * For directional blocks (relative to direction of generation): 0 - Facing
     * Right 1 - Left 2 - Towards 3 - Away 4 - Upside Down Right 5 - Upside Down
     * Left 6 - Upside Down Towards 7 - Upside Down Away
     */
    public static final int RIGHT = 0;
    public static final int LEFT = 1;
    public static final int TOWARDS = 2;
    public static final int AWAY = 3;
    public static final int INVERT_RIGHT = 4;
    public static final int INVERT_LEFT = 5;
    public static final int INVERT_TOWARDS = 6;
    public static final int INVERT_AWAY = 7;

    public static final int[][][][] blockArrayTemple = {{ // y = 11
            { // x = 2
                    {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 3
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 4
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 5
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 6
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 7
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 8
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 9
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 10
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 11
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 12
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.stonebrick)}, {Block.getIdFromBlock(Blocks.stonebrick)}, {}, {}, {Block.getIdFromBlock(Blocks.stonebrick)}, {Block.getIdFromBlock(Blocks.stonebrick)}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 13
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.stonebrick)}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.stonebrick)}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 14
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 15
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 16
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.stonebrick)}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.stonebrick)}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 17
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.stonebrick)}, {Block.getIdFromBlock(Blocks.stonebrick)}, {}, {}, {Block.getIdFromBlock(Blocks.stonebrick)}, {Block.getIdFromBlock(Blocks.stonebrick)}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 18
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 19
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 20
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 21
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 22
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 23
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 24
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 25
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 26
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 28
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 28
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}}, { // y
            // =
            // 12
            { // x = 2
                    {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 3
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 4
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 5
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 6
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 7
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 8
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 9
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 10
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 11
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 12
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.stonebrick)}, {Block.getIdFromBlock(Blocks.stonebrick)}, {}, {}, {Block.getIdFromBlock(Blocks.stonebrick)}, {Block.getIdFromBlock(Blocks.stonebrick)}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 13
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.stonebrick)}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.stonebrick)}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 14
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 15
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 16
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.stonebrick)}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.stonebrick)}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 17
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.stonebrick)}, {Block.getIdFromBlock(Blocks.stonebrick)}, {}, {}, {Block.getIdFromBlock(Blocks.stonebrick)}, {Block.getIdFromBlock(Blocks.stonebrick)}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 18
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 19
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 20
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 21
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 22
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 23
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 24
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 25
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 26
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 28
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}}, { // y
            // =
            // 13
            { // x = 2
                    {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 3
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 4
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 5
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 6
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 7
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 8
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 9
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 10
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 11
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 12
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.cobblestone)}, {Block.getIdFromBlock(Blocks.cobblestone)}, {Block.getIdFromBlock(Blocks.cobblestone)}, {Block.getIdFromBlock(Blocks.cobblestone)}, {Block.getIdFromBlock(Blocks.cobblestone)}, {Block.getIdFromBlock(Blocks.cobblestone)}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 13
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.cobblestone)}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.cobblestone)}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 14
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.cobblestone)}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.cobblestone)}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 15
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.cobblestone)}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.cobblestone)}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 16
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.cobblestone)}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.cobblestone)}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 17
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.cobblestone)}, {Block.getIdFromBlock(Blocks.cobblestone)}, {Block.getIdFromBlock(Blocks.cobblestone)}, {Block.getIdFromBlock(Blocks.cobblestone)}, {Block.getIdFromBlock(Blocks.cobblestone)}, {Block.getIdFromBlock(Blocks.cobblestone)}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 18
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 19
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 20
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 21
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 22
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 23
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 24
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 25
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 26
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 28
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}}, { // y
            // =
            // 14
            { // x = 2
                    {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 3
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 4
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 5
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 6
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 7
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 8
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 9
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 10
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 11
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 12
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.stone_brick_stairs), RIGHT}, {Block.getIdFromBlock(Blocks.stone_brick_stairs), RIGHT}, {Block.getIdFromBlock(Blocks.stone_brick_stairs), RIGHT}, {Block.getIdFromBlock(Blocks.stone_brick_stairs), RIGHT}, {Block.getIdFromBlock(Blocks.stone_brick_stairs), RIGHT}, {Block.getIdFromBlock(Blocks.stone_brick_stairs), RIGHT}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 13
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.stone_brick_stairs), TOWARDS}, {Block.getIdFromBlock(Blocks.stonebrick)}, {Block.getIdFromBlock(Blocks.stonebrick)}, {Block.getIdFromBlock(Blocks.stonebrick)}, {Block.getIdFromBlock(Blocks.stonebrick)}, {Block.getIdFromBlock(Blocks.stone_brick_stairs), AWAY}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 14
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.stone_brick_stairs), TOWARDS}, {Block.getIdFromBlock(Blocks.stonebrick)}, {Block.getIdFromBlock(Blocks.stonebrick)}, {Block.getIdFromBlock(Blocks.stonebrick)}, {Block.getIdFromBlock(Blocks.stonebrick)}, {Block.getIdFromBlock(Blocks.stone_brick_stairs), AWAY}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 15
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.stone_brick_stairs), TOWARDS}, {Block.getIdFromBlock(Blocks.stonebrick)}, {Block.getIdFromBlock(Blocks.stonebrick)}, {Block.getIdFromBlock(Blocks.stonebrick)}, {Block.getIdFromBlock(Blocks.stonebrick)}, {Block.getIdFromBlock(Blocks.stone_brick_stairs), AWAY}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 16
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.stone_brick_stairs), TOWARDS}, {Block.getIdFromBlock(Blocks.stonebrick)}, {Block.getIdFromBlock(Blocks.stonebrick)}, {Block.getIdFromBlock(Blocks.stonebrick)}, {Block.getIdFromBlock(Blocks.stonebrick)}, {Block.getIdFromBlock(Blocks.stone_brick_stairs), AWAY}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 17
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {Block.getIdFromBlock(Blocks.stone_brick_stairs), LEFT}, {Block.getIdFromBlock(Blocks.stone_brick_stairs), LEFT}, {Block.getIdFromBlock(Blocks.stone_brick_stairs), LEFT}, {Block.getIdFromBlock(Blocks.stone_brick_stairs), LEFT}, {Block.getIdFromBlock(Blocks.stone_brick_stairs), LEFT}, {Block.getIdFromBlock(Blocks.stone_brick_stairs), LEFT}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 18
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 19
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 20
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 21
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 22
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 23
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 24
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 25
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 26
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}, { // x
            // =
            // 28
            {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}, {}}},};
}