package com.shc.blox.entities;

import com.shc.blox.Resources;
import com.shc.silenceengine.math.Vector3;
import com.shc.silenceengine.math.geom3d.Cuboid;
import com.shc.silenceengine.scene.entity.Entity3D;

/**
 * @author Sri Harsha Chilakapati
 */
public class Thorns extends Entity3D
{
    public Thorns(Vector3 position)
    {
        super(Resources.Models.THORNS, new Cuboid(position, 0.8f, 0.8f, 0.8f));
        setPosition(position);
    }
}
